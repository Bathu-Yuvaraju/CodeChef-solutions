# OJJAR93

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Dynamic Key Generation in React

We are building a  **Guest List App**  where users can see a list of invitees and remove them by clicking a  **Remove**  button.

However, the current code has a problem:  **it uses array indexes as keys**, which can cause React to behave unexpectedly when guests are removed.

#### Your Task:
- Identify the problem in the existing code.
- Update the code so that each guest has a unique key that does not change when items are added or removed.
- Improve the UI with some basic styling.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T13:56:44.420Z  

```cpp
            { id: 2, name: 'Clark Kent' },
                { id: 3, name: 'Diana Prince' }
                  ]);

                    // Remove guest by filtering on unique ID
                      const removeGuest = (id) => {
                          setGuests(guests.filter((guest) => guest.id !== id));
                            };

                              return (
                                  <div className="container">
                                        <h1>Guest List</h1>
                                              <ul className="guest-list">
                                                      {guests.map((guest) => (
                                                                <li key={guest.id} className="guest-item">
                                                                            <input
                                                                                          defaultValue={guest.name}
                                                                                                        className="guest-input"
                                                                                                                    />
                                                                                                                                <button
                                                                                                                                              className="remove-btn"
                                                                                                                                                            onClick={() => removeGuest(guest.id)}
                                                                                                                                                                        >
                                                                                                                                                                                      Remove
                                                                                                                                                                                                  </button>
                                                                                                                                                                                                            </li>
                                                                                                                                                                                                                    ))}
                                                                                                                                                                                                                          </ul>
                                                                                                                                                                                                                              </div>
                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                }
function App() {
  // Store guests as objects with a stable unique id instead of using array indexes as keys
    const [guests, setGuests] = useState([
        { id: 1, name: 'Bruce Wayne' },

import './App.css';
import React, { useState } from 'react';
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR93)