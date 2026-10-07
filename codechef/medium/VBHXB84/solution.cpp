const express = require('express');
const router = express.Router();

// List all books
router.get('/', (req, res) => {
  res.send('List of all books');
});

// Get book by ID
router.get('/:id', (req, res) => {
  const bookId = req.params.id;
  res.send(`Details of book with ID: ${bookId}`);
});

module.exports = router;
