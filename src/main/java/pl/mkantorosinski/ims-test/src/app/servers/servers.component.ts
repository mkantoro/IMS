import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer = false;
  serverName: string = 'server Name';
  serveCreationStatus: string = 'Server not created';
  serverCreated = false;

  constructor() {
    setTimeout(() => {
      this.allowNewServer = true;
    }, 2000)

  }

  ngOnInit(): void {
  }
  onUpdateServerName(event: Event){
  this.serverName = (<HTMLInputElement>event.target).value;
  }

  onCreateServer(){
    this.serverCreated = true;
    this.serveCreationStatus = 'Server was created! Name is ' + this.serverName;
  }

}
