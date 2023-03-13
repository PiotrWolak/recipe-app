1. how to run


2. exemplary curls for testing \
GET ALL: curl localhost:8080/all
GET ALL NAMES: curl localhost:8080/names
GET:  curl -X DELETE -d "id=1" localhost:8080/remove \
REMOVE:  curl -X DELETE -d "id=1" localhost:8080/remove \
PUT: curl -X PUT -H "Content-Type: application/json" --data '{"id": 1, "name": "potato", "instruction": "just eat it - raw potatoes are the best", "author": "me@gmail.com"}' "localhost:8080/recipe" \
POST:  curl -X PUT -H "Content-Type: application/json" --data '{"name": "potato", "instruction": "just eat it - raw potatoes are the best", "author": "me@gmail.com"}' "localhost:8080/recipe"
