import { Component, OnInit } from '@angular/core';
import {Recipe} from "../recipe.model";

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
recipies: Recipe[] = [new Recipe('Testowy przepis', 'opis przykładowego przepisu',
  'https://upload.wikimedia.org/wikipedia/commons/6/62/Spinach_recipes_or_keerai_kadayal.jpg')
,new Recipe('drugi przykładowy przepis', 'opis drugiego przykładowego przepisu',
    'https://www.cookipedia.co.uk/wiki/images/e/e7/Bulghur_wheat_salad_recipe.jpg')];
  constructor() { }

  ngOnInit(): void {
  }

}
