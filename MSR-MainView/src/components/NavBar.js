import React from "react";
import "../assets/Styles.css";

const NavBarComponent = () => {
    return (


        <nav class="navcomponent">

            <div class="navbar container-fluid">

                <div class="d-flex flex-row align-items-center">
                    <button type="button" class=" btn btn-floating">
                        <i class="upbtn fas fa-angle-double-up"></i>
                    </button>

                    <div class="font-monospace">
                    My Study Room
                    </div>
                </div>

                




                <div class="items d-flex align-items-center">

                    <div class="dropdown">
                        <a
                            class="text-reset me-3 dropdown-toggle hidden-arrow"
                            href="#"
                            id="navbarDropdownMenuLink"
                            role="button"
                            data-mdb-toggle="dropdown"
                            aria-expanded="false">
                            <i class="fas fa-bell"></i>
                            <span class="badge rounded-pill badge-notification bg-danger">1</span>
                        </a>
                        <ul
                            class="dropdown-menu dropdown-menu-end"
                            aria-labelledby="navbarDropdownMenuLink">
                            <li>
                                <a class="dropdown-item" href="#">Some news</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="#">Another news</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="#">Something else here</a>
                            </li>
                        </ul>
                    </div>

                    <div class="dropdown" id="profile">
                        <a class="dropdown-toggle d-flex align-items-center hidden-arrow"
                            href="#"
                            id="navbarDropdownMenuAvatar"
                            role="button"
                            data-mdb-toggle="dropdown"
                            aria-expanded="false">
                            <img src="https://mdbcdn.b-cdn.net/img/new/avatars/2.webp" class="rounded-circle"
                                height="25"
                                alt="Black and White Portrait of a Man"
                                loading="lazy" />
                        </a>
                        <ul
                            class="dropdown-menu dropdown-menu-end"
                            aria-labelledby="navbarDropdownMenuAvatar">
                            <li>
                                <a class="dropdown-item" href="#">My profile</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="#">Settings</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="#">Logout</a>
                            </li>
                        </ul>
                    </div>

                    <button type="button" class="btn btn-floating" id="boton">
                        <i class="fas fa-toggle-on"></i>

                    </button>

                </div>
            </div>
        </nav>


    );
};
export default NavBarComponent;