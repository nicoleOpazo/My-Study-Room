import React from "react";
//import TestComponent from "../components/Test";

const TestView = () => {
    return(
        <div>
            
            <button>
                <a href="http://localhost:3000/">Principal</a>
            </button>
        </div>
    );
};
export default TestView;

/*
const TestView = () => {
    const [isToggled, setIsToggled] = useState(false);

    return(
        <div>
            <SwitchComponent  isToggled={isToggled} onToggle={() => setIsToggled(!isToggled)}/>
        </div>
    );
};
export default TestView;
*/