
                        return (
                            <div
                                  className="product-card"
                                        role="article"
                                              // STEP 3: Conditional border based on price
                                                    style={{
                                                            border:
                                                                      props.product.price > 50
                                                                                  ? "2px solid rgb(255, 0, 0)"
                                                                                              : "2px solid rgb(128, 128, 128)",
                                                                                                    }}
                                                                                                        >
                                                                                                              {/* STEP 1: Product name & price */}
                                                                                                                    <h3>{props.product.name}</h3>
                                                                                                                          <p>Price: ${props.product.price}</p>

                                                                                                                                {/* STEP 2: Select button */}
                                                                                                                                      <button onClick={handleClick}>Select</button>
                                                                                                                                          </div>
                                                                                                                                            );
                                                                                                                                            }

                                                                                                                                            export default function App() {
                                                                                                                                              return (
                                                                                                                                                  <div className="product-list">
                                                                                                                                                        {/* STEP 4: Render all product cards using .map() */}
                                                                                                                                                              {products.map((product) => (
                                                                                                                                                                      <ProductCard key={product.id} product={product} />
                                                                                                                                                                            ))}
                                                                                                                                                                                </div>
                                                                                                                                                                                  );
                                                                                                                                                                                  }