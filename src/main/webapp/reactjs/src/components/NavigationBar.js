import React, {Component} from "react";
import { Navbar, Nav } from "react-bootstrap";
import {Link} from "react-router-dom";

export default class NavigationBar extends Component {
    render() {
        return (
            <Navbar bg="dark" variant="dark">
                <Link to={""} className="navbar-brand">
                    BOOK Shop
                </Link>
 
                <Nav className="mr-auto">
                    <Link to={"add"} className="nav-link">Add Book</Link>
                    <Link to={"list"} className="nav-link">Book Lists</Link>
                </Nav>
            </Navbar>
        );
    }
}