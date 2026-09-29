# OJJAR190

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### About Section

Alright, let's move on to the next challenge!

 **Problem Description:** 

Your next task is to create the "About Me" section for your portfolio. This section is crucial for introducing yourself, sharing a bit about your passion for development, and highlighting your key skills. You'll also include a link to download your resume.

 **Note:** 

- The main container for this section should be a <section> element. It must have an id attribute set to about. It must have a className attribute set to about-section.
- The <div> element wrapping the resume link should have the className="about-actions".
- The resume link (<a> tag) should have two classes: btn and btn-primary.
- The <ul> element listing your skills should have the className="skills-list". Example - <ul className="skills-list"> <li>HTML5</li> <li>CSS3</li>... </ul>

 **Your app's "About" section should aim to look something like this (structure and elements):**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T02:31:41.520Z  

```cpp
function About() {
    return (
        <section id="about" className="about-section">
              <h2>About Me</h2>
                    <p>
                            I am a passionate Full Stack Developer with a strong background in building 
                                    interactive web applications and learning modern web technologies.
                                          </p>
                                                
                                                      <h3>Key Skills</h3>
                                                            <ul className="skills-list">
                                                                    <li>HTML5</li>
                                                                            <li>CSS3</li>
                                                                                    <li>JavaScript</li>
                                                                                            <li>React</li>
                                                                                                    <li>Node.js</li>
                                                                                                          </ul>

                                                                                                                <div className="about-actions">
                                                                                                                        <a href="#resume" className="btn btn-primary">Download Resume</a>
                                                                                                                              </div>
                                                                                                                                  </section>
                                                                                                                                    );
                                                                                                                                    }

                                                                                                                                    export default About;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR190)