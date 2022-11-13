import { Component, OnInit } from '@angular/core';
import {Ingedient} from "../shared/ingredient.model";

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {
ingredients: Ingedient [] = [
  new Ingedient('Apple',5),
  new Ingedient('Tomato',5)];
  constructor() { }

  ngOnInit(): void {
  }

}
