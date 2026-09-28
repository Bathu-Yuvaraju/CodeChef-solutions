import styles from './styles.module.css';

function PriceDisplay({ price }) {
  console.log(`Rendering PriceDisplay with price: ${price}, key: ${price}`);
    
      return (
          <div className={styles.wrapper}>
                {/* Adding the key prop ensures the div remounts and re-triggers the animation when the price changes */}
                      <div key={price} className={styles.animated}>
                              {`$` + price}
                                    </div>
                                        </div>
                                          );
                                          }

                                          export default PriceDisplay;