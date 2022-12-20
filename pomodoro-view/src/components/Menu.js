import React from "react";
import "../assets/Styles.css";
import { useState } from "react";


const MenuComponent = () => {
    const [show, toggleShow] = useState(true);

    return (
        <div >
            <div class="">
                <button className="btn-menu-logo position-absolute top-0 start-0" onClick={() => toggleShow(!show)}>
                    <img src={require('../assets/pomo-logo.png')} className="img-logo"></img>
                    <i class="fas fa-angle-double-down fa-lg"></i>
                    {/* <i class="fas fa-caret-down fa-lg"></i> */}
                </button>
            </div>
            
            {show &&
            <ul class="ulMenu">
                <li class="liMenu">
                    <div
                        className="d-flex d-row align-items-center">
                        <i class="fas fa-bars"></i>
                        <h5 style={{ color: 'white' }}>Menú</h5>
                    </div>
                </li>

                <h1></h1>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                        <i class="fas fa-lightbulb fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Tips & Consejos</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                        <i class="fas fa-sliders-h fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Configuración</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                            <i class="fas fa-headphones fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Música</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                        <i class="fas fa-sticky-note fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Notas</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                        <i class="fas fa-images fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Fondos</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                            <i class="fas fa-calendar-alt fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Calendario</h5>
                    </button>
                </li>

                <li class="liMenu">
                    <button
                        className="btn-menu align-items-center">
                        <i class="fas fa-file-import fa-lg"></i>
                        <h5 style={{ color: 'white' }}>Sube tu archivo</h5>
                    </button>
                </li>
                
                
                
                
            </ul>}
        </div>
    );
};
export default MenuComponent;

/*
<div id="menu-row">
                    <button
                        type="button"
                        className="btn btn-menu">
                    </button>
                    <navlink>
                    <h2 style={{ color: 'white' }}>ALÓ?</h2>
                        <i class="far fa-lightbulb"></i>

                    </navlink>
                </div>


<div class="btn-group dropend">
  <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
    Dropend
  </button>
  <ul class="dropdown-menu">
    <!-- Dropdown menu links -->
  </ul>
</div>


<button onClick={() => toggleShow(!show)}>
                {show ? "Hide" : "Show"}
            </button>
            {show && <h2>ALÓ</h2>}
*/