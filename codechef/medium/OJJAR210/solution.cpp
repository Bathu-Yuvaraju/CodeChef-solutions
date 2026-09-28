                                                                                                // Cleanup timeout on component unmount
                                                                                                  useEffect(() => {
                                                                                                      return () => {
                                                                                                            if (flingTimeoutRef.current) {
                                                                                                                    clearTimeout(flingTimeoutRef.current);
                                                                                                                          }
                                                                                                                              };
                                                                                                                                }, []);

                                                                                                                                  return (
                                                                                                                                      <div className={styles.container}>
                                                                                                                                            <h1>Animated Counter</h1>

                                                                                                                                                  <div className={styles.counterBox}>
                                                                                                                                                          {/* Render the fling message with a key prop so it remounts and re-triggers animations on every click */}
                                                                                                                                                                  {flingMessage && (
                                                                                                                                                                            <div key={flingMessage} className={styles.fling}>
                                                                                                                                                                                        {flingMessage}
                                                                                                                                                                                                  </div>
                                                                                                                                                                                                          )}
                                                                                                                                                                                                                  <div className={styles.countDisplay}>{count}</div>
                                                                                                                                                                                                                        </div>

                                                                                                                                                                                                                              <div className={styles.buttonGroup}>
                                                                                                                                                                                                                                      <button onClick={() => handleIncrement(1)}>+1</button>
                                                                                                                                                                                                                                              <button onClick={() => handleIncrement(5)}>+5</button>
                                                                                                                                                                                                                                                      <button onClick={() => handleIncrement(10)}>+10</button>
                                                                                                                                                                                                                                                            </div>
                                                                                                                                                                                                                                                                </div>
                                                                                                                                                                                                                                                                  );
                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                  export default App;