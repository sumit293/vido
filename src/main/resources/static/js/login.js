


function handleLogin(event) {
    event.preventDefault();

    // Get input values
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const user = {
        email: email,
        password: password
    };

    fetch('https://localhost:8000/api/users/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    }).then(response => {
        if(!response.ok) {
            alert("Login incorrect failed");
        }
        return response.json();
    }).then((response) => {
        localStorage.setItem('connectUser',JSON.stringify(response));
        window.location.href = 'index.html';
    }).catch(error => {
        console.log('post request error ',error);
    })
}

const loginForm = document.getElementById("loginForm");

if (loginForm) {
    loginForm.addEventListener("submit", handleLogin);
}