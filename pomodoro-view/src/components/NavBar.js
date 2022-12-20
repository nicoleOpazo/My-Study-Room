import React, { useCallback } from "react";
import { ThemeSwitchComponent, ZenSwitchComponent } from "../components";
import "../assets/Styles.css";
import "../assets/StylesZen.css"
import { useState } from "react";

import * as mdb from 'mdb-ui-kit'; //lib

//import { FullScreen, useFullScreenHandle } from "react-full-screen";


const dropdownElementList = [].slice.call(document.querySelectorAll('.dropdown-toggle'));
const dropdownList = dropdownElementList.map((dropdownToggleEl) => {
    return new mdb.Dropdown(dropdownToggleEl);
});

const NavBarComponent = () => {
    const [show, toggleShow] = useState(true);

    return (
        <nav class="navbar d-flex ms-auto">
            {/*Dentro de la barra de navegación:
                    
                    2. Avatar 
                    3. ThemeSwitch*/}
            <div class="container">
                <div class="navbar-nav">
                    <div class="d-flex align-items-center">
                        {/*Avatar de usuario*/}
                        <a
                            class="btn btn-dark px-3 me-2"
                            href="/probando"
                            role="button">
                            <i class="fas fa-user-alt"></i>
                        </a>
                        {/*Avatar de usuario*/}

                        {/*Switch Theme*/}
                        {/* <ThemeSwitchComponent round={true} class="px-3 me-2" /> */}
                        {/*Switch Them*/}

                    </div>
                </div>
            </div>
        </nav>
    );
};
export default NavBarComponent;

/*
Entre nav & header:

Switch Zen
<div class="zen d-flex align-items-center px-1">
<ZenSwitchComponent round={true} />
</div>
Switch Zen

Zen
<div class="d-flex align-items-center px-1">
<h6 class="">zen</h6>
</div>
Zen

Botón expandir Zen
<div class="d-flex align-items-center px-1">
<button type="button" class="botoncito btn btn-dark px-2 me-2">
    <i class="fas fa-expand fa-lg"></i>
</button>
</div>
Botón expandir Zen

*/