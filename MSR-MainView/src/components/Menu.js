import React from "react";
import "../assets/Styles.css";
import {
    CDBSidebar,
    CDBSidebarContent,
    CDBSidebarFooter,
    CDBSidebarHeader,
    CDBSidebarMenu,
    CDBSidebarMenuItem,
} from 'cdbreact';
import { NavLink } from 'react-router-dom';




const MenuComponent = () => {
    return (
        <div className="divmenu">
            <CDBSidebar id="menu">
                <CDBSidebarHeader prefix={<i className="fa fa-bars fa-large"></i>} class="cabeza">
                    <a href="#" className="text-decoration-none" style={{ color: 'inherit' }}>Menu</a>
                </CDBSidebarHeader>
                <CDBSidebarContent className="sidebar-content">
                    <CDBSidebarMenu>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="far fa-lightbulb">Tips & Consejos</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-wrench">Configuración</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-music">Música</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-clipboard-list">Notas</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="far fa-images">Fondos</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-calendar-alt">Calendario</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-file-archive">Sube tu archivo</CDBSidebarMenuItem>
                        </NavLink>
                    </CDBSidebarMenu>
                </CDBSidebarContent>
                <CDBSidebarFooter activeClassName="activeClicked" className="pie">
                </CDBSidebarFooter>
            </CDBSidebar>
        </div>



    );
    


};
export default MenuComponent;

/*
Discord icon:
<i class="fab fa-discord"></i>
*/

/*
<div className="wrapper">
            <CDBSidebar id="menu">
                <CDBSidebarHeader prefix={<i className="fa fa-bars fa-large"></i>} class="cabeza">
                    <a href="#" className="text-decoration-none" style={{ color: 'inherit' }}>Menu</a>
                </CDBSidebarHeader>
                <CDBSidebarContent className="sidebar-content">
                    <CDBSidebarMenu>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="far fa-lightbulb">Tips & Consejos</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-wrench">Configuración</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-music">Música</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-clipboard-list">Notas</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="far fa-images">Fondos</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-calendar-alt">Calendario</CDBSidebarMenuItem>
                        </NavLink>
                        <NavLink exact to="#" activeClassName="activeClicked">
                            <CDBSidebarMenuItem icon="fas fa-file-archive">Sube tu archivo</CDBSidebarMenuItem>
                        </NavLink>
                    </CDBSidebarMenu>
                </CDBSidebarContent>
                <CDBSidebarFooter activeClassName="activeClicked" className="pie">
                </CDBSidebarFooter>
            </CDBSidebar>
        </div>
*/


/*
    <div id="mySidepanel" class="sidepanel">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">x</a>
                <a href="#">About</a>
                <a href="#">Services</a>
                <a href="#">Clients</a>
                <a href="#">Contact</a>
            </div>

            <button class="openbtn" onclick="openNav()">☰ Toggle Sidepanel</button>
    */

/*<header class="site-navbar site-navbar-target py-4" role="banner">
           <div class="container">
                   <div class="row align-items-center position-relative">
                       <div class="col-3 ml-auto text-right order-2">
                           <div class="site-logo">
                               <a href="#!" class="font-weight-bold text-white">POMODORO</a>
                           </div>
                       </div>
                       <div class="col-9 order-1 text-left mr-auto">
                           <span class="d-inline-block d-lg-block">
                               <a href="#" class="text-black site-menu-toggle js-menu-toggle py-5 active">
                                   <span class="icon-menu h3 text-white">
                                       ::before
                                   </span>
                               </a>
                           </span>
                           <nav class="site-navigation text-right ml-auto d-none d-lg-none" role="navigation">
                               <ul class="site-menu main-menu js-clone-nav ml-auto">
                                   <li class="active">
                                       <a href="#!" class="nav-link">Home</a>
                                   </li>
                                   <li>
                                       <a href="#!" class="nav-link">Home2</a>
                                   </li>
                                   <li>
                                       <a href="#!" class="nav-link">Home3</a>
                                   </li>
                               </ul>

                           </nav>
                       </div>
                   </div>
               </div>
           </header>*/
