console.log("script loaded");

let currentTheme = getTheme();


//TODO:

function changeTheme() {}

//set themen to localstorage
function setTheme(theme)
{
    localStorage.setItem("theme",theme);
}

//get theme from localstorage
function getTheme()
{
    let theme = localStorage.getItem("theme");
    if (theme) return theme;
    else return "light";
}