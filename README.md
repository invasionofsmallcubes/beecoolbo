Go to beecool.it to see new stuff to buy!

To run it locally, before you need to execute:

```text
#container postegres
docker run --name some-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres
#container client postgres
docker run -it --rm --link some-postgres:postgres postgres psql -h postgres -U postgres
```