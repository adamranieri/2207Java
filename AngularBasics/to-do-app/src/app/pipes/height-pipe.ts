import { Pipe, PipeTransform } from "@angular/core";


@Pipe({name:"height"})
export class HeightPipe implements PipeTransform{

    // a pipe should take in 1 input and give back 1 output
    transform(height:number): string {
        return `${height} ft`;
    }

}