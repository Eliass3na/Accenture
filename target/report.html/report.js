$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testecorreio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 4,
  "name": "Pesquisar no correio",
  "description": "Eu como usuario quero pesquisar um cep para validar as informacoes",
  "id": "pesquisar-no-correio",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@alltest"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Pesquisar o meu cep",
  "description": "",
  "id": "pesquisar-no-correio;pesquisar-o-meu-cep",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "que eu esteja no \"https://www.correios.com.br/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "pesuisar o \"06455-000\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "sistema apresnta logradouro \"Alameda Araguaia\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.correios.com.br/",
      "offset": 18
    }
  ],
  "location": "Steps.que_eu_esteja_no(String)"
});
formatter.result({
  "duration": 11468174800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06455-000",
      "offset": 12
    }
  ],
  "location": "Steps.pesuisar_o(String)"
});
formatter.result({
  "duration": 772494300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alameda Araguaia",
      "offset": 29
    }
  ],
  "location": "Steps.sistema_apresnta_logradouro(String)"
});
formatter.result({
  "duration": 156700,
  "status": "passed"
});
});