                            return (
                                <>
                                      <h1>Score Tracker</h1>

                                            {/* Create +5 Points button */}
                                                  <button onClick={() => addPoints(5)}>+5 Points</button>

                                                        {/* Create -3 Points button */}
                                                              <button onClick={() => subtractPoints(3)}>-3 Points</button>

                                                                    {/* Create Reset button */}
                                                                          <button onClick={resetScore}>Reset</button>
                                                                              </>
                                                                                );
                                                                                }

                                                                                export default App;

                          }
                        console.log("Score reset to 0!");
                    function resetScore() {

                  }
                console.log(`Subtracted ${points} points!`);
            function subtractPoints(points) {

          }
        console.log(`Added ${points} points!`);