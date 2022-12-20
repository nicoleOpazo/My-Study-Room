import { createGlobalStyle } from "styled-components"

export const lightTheme = {
    body: 'yellow'
}

export const darkTheme = {
    body: 'purple'
}

export const GlobalStyles = createGlobalStyle `
body {
    background-color: ${(props) => props.theme.body};
}
`