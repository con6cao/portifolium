//serviços
const servicosEndpoint = "http://localhost:8080/servicos/busca";
function show(servicos) {
  let tab = `<thead>
            <th scope="col"></th>
          <th scope="col"></th>
        </thead>`;

  for (let servico of servicos) {
    tab += `
            <tr>                
            <td>${servico.nome}</td>
                <td>${servico.descricao}</td>
                <td>${servico.nome}</td>
                <td>${servico.imagens}</td>
            </tr>
        `;
  }

  document.getElementById("servicos").innerHTML = tab;
}

async function getServicos() {
  const response = await fetch(servicosEndpoint, {
    method: 'GET',
    headers: new Headers({
      ContentType: 'application/json; charset=utf8',
      Accept: 'application/json',
      cors: 'no-cors'
    }),
  });

  var data = await response.json();
  console.log(data);
  show(data);
}
getServicos();


//projetos

const projetosEndpoint = "http://localhost:8080/projetos/busca";
function show(projetos) {
  let tab = `<thead>
            <th scope="col">Projetos</th>
        </thead>`;

  for (let projeto of projetos) {
    tab += `
            <tr>                
            <td>${projeto.nome}</td>
                <td>${projeto.descricao}</td>
            </tr>
        `;
  }

  document.getElementById("projetos").innerHTML = tab;
}

async function getProjetos() {
  const response = await fetch(projetosEndpoint, {
    method: 'GET',
    headers: new Headers({
      ContentType: 'application/json; charset=utf8',
      Accept: 'application/json',
      cors: 'no-cors'
    }),
  });

  var data = await response.json();
  console.log(data);
  show(data);
}
getProjetos();

//post contato
document.getElementById('servicesForm').addEventListener('submit', function(event) {
  event.preventDefault(); // Prevent default form submission

  // Get form data
  const formData = new FormData(this);

  // Convert FormData to JSON
  /*const jsonData = {};
      formData.forEach((value, key) => {
        jsonData[key] = value;
      });*/

  // Make POST request using Fetch API
  fetch('http://localhost:8080/contatos/envio', {
    method: 'POST',
    headers: {
      'Content-Type': 'multipart/form-data',
      'Cors':'NO-CORS'
    },
    body: formData
  })
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    console.log('Form submission successful:', data);
    // Handle success response here
  })
  .catch(error => {
    console.error('There was a problem with form submission:', error);
    // Handle error here
  });
});


function navbar() {
  var x = document.getElementById("mycabecalho");
  if (x.className === "cabecalho") {
    x.className += " responsive";
  } else {
    x.className = "cabecalho";
  }
}