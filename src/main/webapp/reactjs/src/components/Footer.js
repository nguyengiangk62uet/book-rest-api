import React, {Component} from "react";
import { Navbar, Col, Container } from "react-bootstrap";

export default class Footer extends Component {
    render () {
        let fullYear = new Date().getFullYear();
        return (
            <Navbar fixed="bottom" bg="dark" variant="dark"> 
                <Container>
                    <Col lg={12} className="text-center text-muted text-white-50">
                        <div>{fullYear}-{fullYear + 1}, All Rights Reserved by NTGIANG</div>
                    </Col>
                </Container>
            </Navbar>
        );
    }
}
