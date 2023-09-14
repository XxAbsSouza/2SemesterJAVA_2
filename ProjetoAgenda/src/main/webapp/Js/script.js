const campoForm = document.querySelectorAll("[required]");
console.log(campoForm);

campoForm.forEach((campo) => {
    campo.addEventListener("blur", () => validar(campo));
});

function validar(campo) {
    campo.name === "cpf" ? alert(campo.value) : alert("Fail");
}
