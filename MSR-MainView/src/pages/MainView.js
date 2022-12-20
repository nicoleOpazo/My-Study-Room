import React from "react";
import { MenuComponent, NavBarComponent, PomodoroClockComponent } from "../components";
import "../assets/Styles.css";




const MainView = () => {
    return(
        <div class="fondo">
            <div class="navview">
                <NavBarComponent/>
            </div>

            

            <div class="main">
                <div id="menuu">
                    <MenuComponent/>
                </div>

                <div id="pomodoro">
                    
                    <PomodoroClockComponent />

                </div>

            </div>
        </div>
    );
};
export default MainView;