import React from "react";
import "../assets/Styles.css";

import cx from "classnames";

const ThemeSwitchComponent = ({ round = false }) => {
    /* let clickedClass = "clicked";
    const body = document.body;
    const lightTheme = "light";
    const darkTheme = "dark";
    let theme;

    if(localStorage) {
        theme = localStorage.getItem("theme");
    }

    if(theme === lightTheme || theme == darkTheme) {
        body.classList.add(theme);
    } else {
        body.classList.add(lightTheme)
    }

    const switchTheme = (e) => {
        if(theme == darkTheme) {
            body.classList.replace(darkTheme, lightTheme);
            e.target.classList.remove(clickedClass);
            localStorage.setItem("theme", "light");
            theme = lightTheme;
        } else {
            body.classList.replace(lightTheme, darkTheme);
            e.target.classList.add(clickedClass);
            localStorage.setItem("theme", "dark");
            theme = darkTheme;
        }
    }; */

    const sliderCX = cx("slider", {
        'round': round
    });

    return (
        /* <button
            className={theme === "dark" ? clickedClass : ""}
            id ="darkMode"
            onClick={(e) => switchTheme(e)}>
        </button> */

        <label className="switch">
            <input type="checkbox" />
            <span className={sliderCX} />
        </label>
    );
};
export default ThemeSwitchComponent;

/*
const SwitchComponent = ({rounded = false, isToggled, onToggle}) => {
    const sliderCX = cx("slider", {
        'rounded' : rounded
    });

    return(
        <label className="switch">
            <input type="checkbox" checked={isToggled} onChange={onToggle}/>
            <span className={sliderCX}/>
        </label>
    );
};
export default SwitchComponent;
*/