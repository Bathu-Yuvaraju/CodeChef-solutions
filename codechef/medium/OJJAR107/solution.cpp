import React, { useState, useEffect } from "react";

function LightSwitch() {
  const [isOn, setIsOn] = useState(false);

    useEffect(() => {
        const handleKeyPress = (e) => {
              if (e.code === 'KeyL') {
                      // Uses functional update to always get the latest state
                              setIsOn(prevIsOn => !prevIsOn);
                                    }
                                        };

                                            window.addEventListener('keydown', handleKeyPress);
                                                return () => window.removeEventListener('keydown', handleKeyPress);
                                                  }, []); // Empty dependency array prevents re-adding listener on every render

                                                    return (
                                                        <div>
                                                              <button onClick={() => setIsOn(prevIsOn => !prevIsOn)}>
                                                                      Toggle Light (Button)
                                                                            </button>
                                                                                  <p>Light is {isOn ? "ON 🌟" : "OFF 🌑"}</p>
                                                                                        <small>Press "L" key to toggle!</small>
                                                                                            </div>
                                                                                              );
                                                                                              }

                                                                                              export default LightSwitch;