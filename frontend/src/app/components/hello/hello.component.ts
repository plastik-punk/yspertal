import {Component, OnInit} from '@angular/core';
import {HelloService} from "../../services/hello.service";
import {FormsModule, NgForm} from "@angular/forms";
import {NgIf} from "@angular/common";

@Component({
  selector: 'hello',
  standalone: true,
  imports: [
    FormsModule,
    NgIf
  ],
  templateUrl: './hello.component.html',
  styleUrl: './hello.component.scss'
})
export class HelloComponent implements OnInit{
  hello: string = "";
  name: string = "World";

  constructor(
    private helloService: HelloService
  ) {
  }

  ngOnInit(): void {
    this.getHello();
  }

  getHello(): void {
    this.helloService.getHello(this.name).subscribe({
      next: (data) => {
        this.hello = data;
      },
      error: (error) => {
        console.error(error);
      }
    });
  }
}
