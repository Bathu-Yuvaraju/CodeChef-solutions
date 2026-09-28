//  write your code here
const express = require('express');
const app = express();
const port =3000;
const timeLogger = (req, res, next) => {
    const time = new Date();
    console.log(`Route: ${req.url}, Time: ${time}`);
    next();
};
app.use(timeLogger);
app.get('/',(req, res) =>{
    res.send('Home Pge');
});
app.listen(port, () =>{
    console.log(`Server Listening on port ${port}`);
});