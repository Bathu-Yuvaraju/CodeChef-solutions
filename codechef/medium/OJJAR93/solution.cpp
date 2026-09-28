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