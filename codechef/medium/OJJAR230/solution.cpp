function Tab({ label, isActive, onClick }) {
    const activeStyle = {
        backgroundColor: isActive ? '#333' : '#eee',
            color: isActive ? '#fff' : '#000',
                padding: '10px 20px',
                    border: 'none',
                        cursor: 'pointer',
                            borderRadius: '4px',
                                fontWeight: 'bold',
                                  };

                                    return (
                                        <button style={activeStyle} onClick={onClick}>
                                              {label}
                                                  </button>
                                                    );
                                                    }

                                                    export default Tab;