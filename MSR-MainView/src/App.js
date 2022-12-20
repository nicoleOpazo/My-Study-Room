import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { MainView, TestView } from "./pages";

const App = () => {
  return(
    <BrowserRouter>
          <Routes>
              <Route path="/" element={<MainView/>}/>
              <Route path="/Test" element={<TestView/>}/>
          </Routes>
      </BrowserRouter>
  );
};
export default App;