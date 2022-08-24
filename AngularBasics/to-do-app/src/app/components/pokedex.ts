import { HttpClient } from "@angular/common/http";
import { Component } from "@angular/core";
import { firstValueFrom } from "rxjs";
import { Pokemon } from "../models/pokemon";


@Component({
    template:`
        <h1>Pokedex</h1>

        <h4>{{100 | currency}}</h4>

        <input type="text" placeholder="machamp" [(ngModel)] = "pokename">

        <button (click)="getPokemon()">Get Pokemon</button>

        <div *ngIf="pokemonFound">
            <h4>Name {{pokemon.name}} </h4>
            <h4>Height {{pokemon.height | height}}</h4>
            <h4>Weight {{pokemon.weight}}</h4>

            <h3>abilities</h3>
            <ul>
                <li *ngFor="let ability of pokemon?.abilities"> {{ability.ability.name}}</li>
            </ul>
        </div>


    `,
    selector:"pokedex"
})
export class PokedexComponent{

    // httpClient is a service written by angular of making HTTP Requests

    constructor(private httpClient:HttpClient){};

    pokemonFound: boolean = false;
    pokename: string = "";
    pokemon: Pokemon = null;


    async getPokemon(){
    // I like promises and toPromise
    // const body = await this.httpClient.get("https://pokeapi.co/api/v2/pokemon/lugia").toPromise();
        
        const observable = this.httpClient.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${this.pokename}`);
        const body = await firstValueFrom(observable);

        this.pokemonFound = true;
        this.pokemon = body;
        
    }


}