import React from "react";
import "../assets/Styles2.css";
//import "../assets/StylesZen.css"
import { useEffect, useRef } from "react";

//import * as mdb from 'mdb-ui-kit'; lib

function App() {

  const contenedorRef = useRef < HTMLDivElement > (null);
  const boxRef = useRef < HTMLDivElement > (null);
  const isClicked = useRef < boolean > (false);

  const coords = useRef < {
    startX: number,
    startY: number,
    lastX: number,
    lastY: number,
  } > ({
    startX: 0,
    startY: 0,
    lastX: 0,
    lastY: 0
  })


  useEffect(() => {
    if (!boxRef.current || !contenedorRef.current) return;

    const box = boxRef.current;
    const contenedor = contenedorRef.current;




    const onMouseDown = (e: MouseEvent) => {
      isClicked.current = true;
      coords.current.startX = e.clientX;
      coords.current.startY = e.clientY;
    }

    const onMouseUp = (e: MouseEvent) => {
      isClicked.current = false;
      coords.current.lastX = box.offsetLeft;
      coords.current.lastY = box.offsetTop;
    }

    const onMouseMove = (e: MouseEvent) => {
      if (!isClicked.current) return;

      const nextX = e.clientX - coords.current.startX + coords.current.lastX;
      const nextY = e.clientY - coords.current.startY + coords.current.lastY;

      box.style.left = `${nextX}px`;
      box.style.top = `${nextY}px`;
    }

    box.addEventListener('mousedown', onMouseDown);
    box.addEventListener('mouseup', onMouseUp);
    contenedor.addEventListener('mousemove', onMouseMove);
    contenedor.addEventListener('mouseleave', onMouseUp);




    const cleanup = () => {
      box.removeEventListener('mousedown', onMouseDown);
      box.removeEventListener('mousedown', onMouseUp);
      contenedor.removeEventListener('mousemove', onMouseMove);
      contenedor.removeEventListener('mouseleave', onMouseUp);
    }
    return cleanup;

  }, [])


  return (
    <div className="a">
      <div ref={contenedorRef} className="contenedor">
        <div ref={boxRef} className="box">

        </div>
      </div>
    </div>
  );
};
export default App;