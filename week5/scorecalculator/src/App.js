import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Compontents/CalculatorScore';
function App() {
  return (
            <div>

            <CalculateScore
                Name="Steeve"
                School="DNV Public School"
                total={284}
                goal={300}
            />

        </div>
  );
}

export default App;
