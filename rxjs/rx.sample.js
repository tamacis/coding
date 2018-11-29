import {Observable} from 'rxjs/Observable';
import {map} from 'rxjs/operator/map';

Observable.of(1,2,3)::map(x => x + '!!!');
