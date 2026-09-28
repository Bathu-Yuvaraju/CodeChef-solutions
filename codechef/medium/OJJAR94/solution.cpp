import React, { useState } from 'react';

// Child Component: Controlled by the parent via props
function TextInput({ value, onChange }) {
  return <input value={value} onChange={onChange} />;
  }

  // Parent Component: Holds the shared state
  function App() {
    // 1. Lift state up to the parent component
      const [sharedText, setSharedText] = useState('');

        // 2. Handler function to update state when typing
          const handleTextChange = (event) => {
              setSharedText(event.target.value);
                };

                  return (
                      <div>
                            <h2>Type in either box:</h2>
                                  {/* 3. Pass state and handler function down to both inputs */}
                                        <TextInput value={sharedText} onChange={handleTextChange} />
                                              <br />
                                                    <TextInput value={sharedText} onChange={handleTextChange} />
                                                          <p>Current Shared Text: {sharedText}</p>
                                                              </div>
                                                                );
                                                                }

                                                                export default App;