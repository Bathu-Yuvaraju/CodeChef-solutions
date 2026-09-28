
                                                        const handleAdd = () => {
                                                            addTask(inputValue);
                                                                setInputValue("");
                                                                  };

                                                                    return (
                                                                        <div>
                                                                              <input
                                                                                      type="text"
                                                                                              placeholder="Enter a task..."
                                                                                                      value={inputValue}
                                                                                                              onChange={(e) => setInputValue(e.target.value)}
                                                                                                                    />
                                                                                                                          <button onClick={handleAdd}>Add</button>
                                                                                                                              </div>
                                                                                                                                );
                                                                                                                                }

                                                                                                                                function TaskList({ tasks, removeTask }) {
                                                                                                                                  return (
                                                                                                                                      <ul style={{ listStyleType: "none", padding: 0 }}>
                                                                                                                                            {tasks.map((task, index) => (
                                                                                                                                                    <li key={index} style={{ margin: "10px 0" }}>
                                                                                                                                                              <span>{task}</span>{" "}
                                                                                                                                                                        <button onClick={() => removeTask(index)}>Remove</button>
                                                                                                                                                                                </li>
                                                                                                                                                                                      ))}
                                                                                                                                                                                          </ul>
                                                                                                                                                                                            );
                                                                                                                                                                                            }

                                                                                                                                                                                            export default App;