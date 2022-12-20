import React from "react";
//import "../assets/StylesZen.css";

import cx from "classnames";

const ZenSwitchComponent = ({ round = false }) => {
    const sliderCX = cx("sliderZen", {
        'round': round
    });

    return (
        <label className="switchZen">
            <input type="checkbox" />
            <span className={sliderCX} />
        </label>
    );
};
export default ZenSwitchComponent;