                                                // 3. Refactored MainContentArea Component (Generic layout using children)
                                                function MainContentArea({ children }) {
                                                  return (
                                                      <div className="main-content">
                                                            <h2>User Section</h2>
                                                                  {children}
                                                                      </div>
                                                                        );
                                                                        }

                                                                        // 4. Top-level Page Component (Handles data and composes the hierarchy)
                                                                        function UserProfilePage() {
                                                                          const userData = {
                                                                              name: 'Alice Wonderland',
                                                                                  bio: 'Curious explorer of digital rabbit holes.',
                                                                                      actionText: 'View Profile',
                                                                                        };

                                                                                          return (
                                                                                              <MainContentArea>
                                                                                                    <CardWrapper>
                                                                                                            <Card
                                                                                                                      headerContent={userData.name}
                                                                                                                                footerContent={<button>{userData.actionText}</button>}
                                                                                                                                        >
                                                                                                                                                  <p>{userData.bio}</p>
                                                                                                                                                          </Card>
                                                                                                                                                                </CardWrapper>
                                                                                                                                                                    </MainContentArea>
                                                                                                                                                                      );
                                                                                                                                                                      }

                                                                                                                                                                      export default UserProfilePage;