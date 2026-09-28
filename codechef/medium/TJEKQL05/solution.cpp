app.get('/', (req, res) => {
  res.send('Welcome to the Bookstore API!');
});

// Mount routers
app.use('/books', booksRouter);
app.use('/authors', authorsRouter);

// Start the server
app.listen(port, () =>{
  console.log(`Server listening on port ${port}`);
});

// Root route

const authorsRouter = require('./authors');
const booksRouter = require('./books');
// Import routers
const port = 3000;

const app = express();
const express = require('express');