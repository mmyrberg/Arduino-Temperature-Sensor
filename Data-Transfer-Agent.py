# Importera bibliotek för seriell kommunikation och HTTP-requests
import sys
import serial
import requests

# Anslut till Arduino med seriell koppling
ser = serial.Serial('COM3', 9600, timeout=1)

# URL:en till Spring Boot-webbtjänsten. Destinationsadress för POST-förfrågan (REST API)
spring_boot_url = 'http://localhost:8080/Temperature/add'

# Kör programmet tills manuellt avbrott
while True:

    # Läs in värdena från den seriella Arduino-anslutningen
    value = ser.readline()

    # Om det finns ett värde på linjen
    if value:
        
        try:
            # konvertera till en float
            value_float = float(value)

            # Skapa JSON-payload för REST request
            payload = {'temperature': value_float} 
            
            # Gör ett HTTP POST-request till den angivna URL:en på det specificerade JSON-formatet
            # Responsen från webbtjänsten, lagras i variabeln response
            response = requests.post(spring_boot_url, json=payload) 

            # Om statuskoden i svaret från webbtjänsten är 200, har förfrågan lyckats
            if response.status_code == 200: 
                print(f'Successfully sent value {value_float} to Spring Boot.')
            else:
                print(f'Failed to send value to Spring Boot. Status code: {response.status_code}')

        # Felhantering
        except ValueError as e:
            print(f'Failed to convert value to float: {e}')
            sys.exit(1)
            
        except Exception as e:
            print(f'An error occurred: {e}')
            sys.exit(1)
            