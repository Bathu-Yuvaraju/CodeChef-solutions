# OJJAR210

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### React Counter App

We're working on a  **React counter app**  that should display a small animated "fling" message (like `+5`) every time the user clicks the increment button.

 **Application should be working like this** 

However, the current implementation isn’t working as expected. You’re already familiar with the concept — now it’s time to fix the behavior.

#### What You Need to Do
- Ensure the fling message shows every time the user clicks an increment button — even if the same button is clicked quickly multiple times! Solution Hint: Use the key property to help React re-render the element.
- Ensure the fling message doesn't show on initial render, but only when the count is incremented.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T15:52:08.439Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR210)