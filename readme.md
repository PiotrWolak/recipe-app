1. how to run


2. exemplary curls for testing \
GET:  curl -X DELETE -d "id=1" localhost:8080/remove \
REMOVE:  curl -X DELETE -d "id=1" localhost:8080/remove \
POST/PUT: curl -X PUT -H "Content-Type: application/json" --data '{"id": 1, "name": "kisl", "instruction": "really simple, my friend", "author": "me"}' "localhost:8080/recipe"
