import React, {Component} from "react";
import {Jumbotron} from "react-bootstrap";

export default class Welcome extends Component {
    render() {
        return (
            <Jumbotron className="bg-dark text-white">
                <h1>Welcome to Book Shop</h1>
                <p>
                    <blockquote className="blockquote mb-0">
                        <p>Death is like the wind, always by my side! Follow the wind, but watch your back.</p>
                        <footer className="blockquote-footer">
                            Yasuo
                        </footer>
                    </blockquote>
                </p>
            </Jumbotron>
        );
    }
}
