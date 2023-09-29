
# Proyecto Semana 3

Este proyecto se basa en el desarrollo de un microservico con Sprinboot.
Desde este proyecto accederemos a nuestro microservico Book.
Con las dependencias de Spring Web.

Esta aplicación se ha hecho con la intención de ser ampliada a lo largo de las siguientes semanas.


## Authors

- [Sergio](https://www.github.com/sreturns)


## Tech Stack

 Java, SpringBoot, Maven


## API Reference

#### Get all BookCopys

```
  GET /bookCopy
```


#### Get BookCopy

```
  GET /bookCopy/{isbn}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `isbn`      | `BookCopy` | **Required**. Isbn of BookCopy to fetch 

#### Add BookCopy

```
  POST /bookCopy
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Book`      |  | **Required**. Type BookCopy object 

#### Update BookCopy

```
  PUT /bookCopy
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `BookCopy`      |  | **Required**. Type BookCopy object 

#### Delete BookCopy

```
  DELETE /bookCopy/{isbn}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `isbn`      |  | **Required**. Isbn of bookCopy to fetch  

