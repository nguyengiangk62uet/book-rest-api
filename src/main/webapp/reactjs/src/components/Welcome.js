import React from "react";
import {Jumbotron} from "react-bootstrap";

class Welcome extends React.Component {
    render() {
        return (
            <Jumbotron className="bg-dark text-white">
                <h1>Welcome to Book Shop</h1>
                <p>
                    <blockquote className="blockquote mb-0">
                        <p>Death is like the wind, always by my side!</p>
                        <footer className="blockquote-footer">
                            Yasuo
                        </footer>
                    </blockquote>
                </p>
            </Jumbotron>
        );
    }
}

export default Welcome;
