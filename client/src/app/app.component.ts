import { Component } from '@angular/core';
import { MovieService } from './shared/movie/movie.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Movie Rental';
  movies: Array<any>

  constructor(private movieService: MovieService) { }

  ngOnInit() {
      this.movieService.getAll().subscribe(data => {
        this.movies = data;
      });
    }
}
