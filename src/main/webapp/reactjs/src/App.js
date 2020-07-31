import React from 'react';
import './App.css';
import NavigationBar from "./components/NavigationBar";
import { Container, Row, Col } from "react-bootstrap";
import Welcome from "./components/Welcome";
import Footer from "./components/Footer";
import Book from './components/Book';
import BookList from './components/BookList';

function App() {
  const marginTop = {
    marginTop: "20px"
  };

  return (
    <div className="App">
      <NavigationBar />
      <Container>
        <Row>
          <Col lg={12} style={marginTop}>
            <Welcome></Welcome>
            <Book></Book>
            <BookList></BookList>
          </Col>
        </Row>
      </Container>
      <Footer/>
    </div>
  );
}

export default App;
