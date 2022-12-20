import React, { useCallback } from "react";
import "../assets/Styles.css";

//import { FullScreen, useFullScreenHandle } from "react-full-screen";


//const el = document.getElementById("boton-zen")

const ZenButtonComponent = () => {
    //const handle = useFullScreenHandle();

    return (
            <div>
                <button type="button" class="botoncito btn btn-dark px-2 me-2" id="boton-zen">
                    <i class="fas fa-expand fa-lg"></i>
                </button>
            </div>
    );
};
export default ZenButtonComponent;