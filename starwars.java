const axios = require('axios');
const fs = require('fs');

async function fetchData() {
    try {
        // Recurso "personas"
        const peopleResponse = await axios.get('https://swapi.dev/api/people/');
        const numberOfCharacters = peopleResponse.data.count;
        const selectedCharacters = peopleResponse.data.results.slice(0, 5);

        // Recurso "naves estelares"
        const starshipsResponse = await axios.get('https://swapi.dev/api/starships/');
        const numberOfStarships = starshipsResponse.data.count;
        const selectedStarships = starshipsResponse.data.results.slice(0, 4);

        // Recurso "especie"
        const speciesResponse = await axios.get('https://swapi.dev/api/species/');
        const numberOfSpecies = speciesResponse.data.count;
        const selectedSpecies = speciesResponse.data.results.slice(0, 5);

        // Recurso "planetas"
        const planetsResponse = await axios.get('https://swapi.dev/api/planets/');
        const numberOfPlanets = planetsResponse.data.count;
        const selectedPlanets = planetsResponse.data.results.slice(0, 3);

        // Escribir la información en un archivo de Word
        const content = `
            Recurso "personas":
            Número de letras: ${numberOfCharacters}
            Personajes seleccionados: ${JSON.stringify(selectedCharacters, null, 2)}

            Recurso "naves estelares":
            Número de naves espaciales: ${numberOfStarships}
            Naves espaciales seleccionadas: ${JSON.stringify(selectedStarships, null, 2)}

            Recurso "especie":
            Número de especies: ${numberOfSpecies}
            Especies seleccionadas: ${JSON.stringify(selectedSpecies, null, 2)}

            Recurso "planetas":
            Número de planetas: ${numberOfPlanets}
            Planetas seleccionados: ${JSON.stringify(selectedPlanets, null, 2)}
        `;

        fs.writeFileSync('informe_star_wars.docx', content);
        console.log('Informe generado con éxito.');
    } catch (error) {
        console.error('Error al obtener los datos:', error);
    }
}

fetchData();
