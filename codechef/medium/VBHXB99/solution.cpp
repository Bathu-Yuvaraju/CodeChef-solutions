const express = require('express');
const path = require('path');

const app = express();

// Middleware to parse URL-encoded form data
app.use(express.urlencoded({ extended: false }));

// Middleware to parse JSON data
app.use(express.json());

// Serve static files from the "public" folder
app.use(express.static(path.join(__dirname, 'public')));

// Route to handle form submissions
app.post('/add-todo-form', (req, res) => {
    console.log('Form To-Do received:', req.body);
        res.send('To-Do added!');
        });

        // Route to handle JSON submissions
        app.post('/add-todo-json', (req, res) => {
            console.log('JSON To-Do received:', req.body);
                res.json(req.body);
                });

                // Start the server
                const PORT = 3000;

                app.listen(PORT, () => {
                    console.log(`Server listening on port ${PORT}`);
                    });